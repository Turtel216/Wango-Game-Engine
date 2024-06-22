package loader

import (
	"image"
	"os"

	"github.com/gopxl/pixel/v2"
)

type loader interface {
	loadImage(string) (pixel.Picture, error)
}

type GameAssetsLoader struct {
}

func LoadImage(path string) (pixel.Picture, error) {
	file, err := os.Open(path)
	if err != nil {
		return nil, err
	}

	defer file.Close()

	img, _, err := image.Decode(file)
	if err != nil {
		return nil, err
	}

	return pixel.PictureDataFromImage(img), nil
}
