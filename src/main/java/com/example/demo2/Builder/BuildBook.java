package com.example.demo2.Builder;

public class BuildBook {
    private long id;
    private String name;
    private String type;
    private boolean isPublished;

    private BuildBook(BookBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.type = builder.type;
        this.isPublished = builder.isPublished;
    }
    
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public boolean isPublished() {
        return isPublished;
    }

    @Override
    public String toString() {
        return "Id= " + this.getId() + ", Name= " + this.getName() + ", Type= " + this.getType();
    }

    public static class BookBuilder {
        private long id;
        private String name;
        private String type;
        private boolean isPublished;

        public BookBuilder(long id, String name, String type) {
            this.id = id;
            this.name = name;
            this.type = type;
        }

        public BookBuilder setIsPublished(boolean isPublished) {
            this.isPublished = isPublished;
            return this;
        }

        public BuildBook build() {
            return new BuildBook(this);
        }
    }
}
