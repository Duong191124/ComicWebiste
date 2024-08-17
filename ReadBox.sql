create database ReadBox;
use ReadBox;

-- Bảng User_Roles
CREATE TABLE User_Roles (
    role_id INT AUTO_INCREMENT PRIMARY KEY,
    role_name VARCHAR(50) NOT NULL
);

-- Bảng Tags
CREATE TABLE Tags (
    tag_id INT AUTO_INCREMENT PRIMARY KEY,
    tag_name VARCHAR(50) NOT NULL
);

-- Bảng Genres
CREATE TABLE Genres (
    genre_id INT AUTO_INCREMENT PRIMARY KEY,
    genre_name VARCHAR(50) NOT NULL,
    description TEXT
);

-- Bảng Users
CREATE TABLE Users (
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    fullname varchar(50),
    password VARCHAR(255) NOT NULL,
    email VARCHAR(100) NOT NULL,
    registration_date DATETIME NOT NULL,
    role_id INT,
    FOREIGN KEY (role_id) REFERENCES User_Roles(role_id)
);

-- Bảng Authors
CREATE TABLE Authors (
    author_id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT,
    FOREIGN KEY (user_id) REFERENCES Users(user_id)
);

-- Bảng Stories
CREATE TABLE Stories (
    story_id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    description TEXT,
    author_id INT,
    genre_id INT,
    publish_date DATETIME NOT NULL,
    status VARCHAR(50) NOT NULL,
    views INT DEFAULT 0,
    chapter_count INT DEFAULT 0,
    FOREIGN KEY (author_id) REFERENCES Authors(author_id),
    FOREIGN KEY (genre_id) REFERENCES Genres(genre_id)
);

-- Bảng Chapters
CREATE TABLE Chapters (
    chapter_id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    content TEXT,
    chapter_number INT NOT NULL,
    story_id INT,
    FOREIGN KEY (story_id) REFERENCES Stories(story_id)
);

-- Bảng Comments
CREATE TABLE Comments (
    comment_id INT AUTO_INCREMENT PRIMARY KEY,
    content TEXT NOT NULL,
    user_id INT,
    story_id INT,
    chapter_id INT,
    comment_date DATETIME NOT NULL,
    FOREIGN KEY (user_id) REFERENCES Users(user_id),
    FOREIGN KEY (story_id) REFERENCES Stories(story_id),
    FOREIGN KEY (chapter_id) REFERENCES Chapters(chapter_id)
);

-- Bảng Ratings
CREATE TABLE Ratings (
    rating_id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT,
    story_id INT,
    rating INT NOT NULL CHECK (rating >= 1 AND rating <= 5),
    rating_date DATETIME NOT NULL,
    FOREIGN KEY (user_id) REFERENCES Users(user_id),
    FOREIGN KEY (story_id) REFERENCES Stories(story_id)
);

-- Bảng Favorites
CREATE TABLE Favorites (
    favorite_id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT,
    story_id INT,
    favorite_date DATETIME NOT NULL,
    FOREIGN KEY (user_id) REFERENCES Users(user_id),
    FOREIGN KEY (story_id) REFERENCES Stories(story_id)
);

-- Bảng Story_Tags
CREATE TABLE Story_Tags (
    story_id INT,
    tag_id INT,
    PRIMARY KEY (story_id, tag_id),
    FOREIGN KEY (story_id) REFERENCES Stories(story_id),
    FOREIGN KEY (tag_id) REFERENCES Tags(tag_id)
);

-- Bảng Images Story
CREATE TABLE Images_Story (
    image_id INT AUTO_INCREMENT PRIMARY KEY,
    image_url VARCHAR(255) NOT NULL,
    story_id INT,
    FOREIGN KEY (story_id) REFERENCES Stories(story_id)
);

-- Bảng Images User
CREATE TABLE Images_User (
    image_id INT AUTO_INCREMENT PRIMARY KEY,
    image_url VARCHAR(255) NOT NULL,
	user_id INT,
    FOREIGN KEY (user_id) REFERENCES Users(user_id)
);

-- Bảng Images Chapter
CREATE TABLE Images_Chapter (
    image_id INT AUTO_INCREMENT PRIMARY KEY,
    image_url VARCHAR(255) NOT NULL,
    chapter_id INT,
    FOREIGN KEY (chapter_id) REFERENCES Chapters(chapter_id)
);

