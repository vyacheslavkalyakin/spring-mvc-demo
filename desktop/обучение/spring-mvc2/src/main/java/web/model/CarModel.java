package web.model;

public class CarModel {
        private int id;
        private String model;
        private String color;

        public CarModel(int id, String model, String color) {
            this.color = color;
            this.model = model;
            this.id = id;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
    }

