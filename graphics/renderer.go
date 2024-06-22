package graphics

import (
	"fmt"

	"github.com/Turtel216/Wango-Game-Engine/loader"
	"github.com/gopxl/pixel/pixelgl"
	"github.com/gopxl/pixel/v2"
)

type Render interface {
	Run()
}

type GameRenderer struct {
	sizeX       int
	sizeY       int
	window_name string
}

func NewGameRenderer(sizeX int, sizeY int, window_name string) *GameRenderer {
	return &GameRenderer{
		sizeX:       sizeX,
		sizeY:       sizeY,
		window_name: window_name,
	}
}

func (renderer GameRenderer) Run() {
	cfg := pixelgl.WindowConfig{
		Title:  renderer.window_name,
		Bounds: pixel.R(0, 0, float64(renderer.sizeX), float64(renderer.sizeY)),
	}

	win, err := pixelgl.NewWindow(cfg)
	if err != nil {
		fmt.Println("Could create window")
		panic(err)
	}

	pic, err := loader.LoadImage("img.png")
	if err != nil {
		fmt.Println("Could not load image")
		panic(err)
	}

	sprite := pixel.NewSprite(pic, pic.Bounds())

	win.Clear()
	sprite.Draw(win, pixel.IM)

	for !win.Closed() {
		win.Update()
	}
}
