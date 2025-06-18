package com.bpe.builder;

public class Computer {
	  
    private String cpu;
    private String ram;

   
    private String storage;
    private String graphicsCard;
    private String os;

   
    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.os = builder.os;
    }

    public static class Builder {
  
        private String cpu;
        private String ram;

    
        private String storage;
        private String graphicsCard;
        private String os;

       
        public Builder(String cpu, String ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Builder setOS(String os) {
            this.os = os;
            return this;
        }
        public Computer build() {
            return new Computer(this);
        }
    }

    public void showSpecs() {
        System.out.println("Computer Specs:");
        System.out.println("CPU: " + cpu);
        System.out.println("RAM: " + ram);
        System.out.println("Storage: " + (storage != null ? storage : "Not Included"));
        System.out.println("Graphics Card: " + (graphicsCard != null ? graphicsCard : "Not Included"));
        System.out.println("Operating System: " + (os != null ? os : "Not Installed"));
        System.out.println("-----------");
    }
}
