package com.example.demo2.Builder;

public class Book {
    private long id;
    private String name;
    private String type;
    private boolean isPublished;

    private Book(BookBuilder builder) {
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

        public Book build() {
            return new Book(this);
        }
    }
}
