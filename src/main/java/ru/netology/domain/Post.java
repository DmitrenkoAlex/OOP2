package ru.netology.domain;

public class Post {
    private int id; //идентификатор поста
    private int userId; //идентификатор пользователя, на чьей стене размещен пост
    private int date; // время публикации
    private String postContent; // содержание публикации
    private int likeCount; // количество лайков
    private int commentId; //идентификатор комменатарий
    private int userCommentId; //идентификатор пользователя,который оставил комменатарий
    private String commentContent; // содержание комменатария
    private int repostCount; // количество репостов
    private int userRepostId; //идентификатор пользователей, репостнувших запись
    private int viewsCount; // коичество прсмотров


    // do setters & getters


}
