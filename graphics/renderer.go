package graphics

type Render interface {
}

type GameRenderer struct {
	sizeX       int
	sizeY       int
	window_name string
}
