package com.example.telegrambot.entities;
public class Tasks {
    /**
     * Id
     */
    private Integer id;
    /**
     * Заголовок
     */
    private String title;
    /**
     * Автор
     */
    private String author;
    /**
     * Текст
     */
    private String text;

    /**
     * Конструктор по умолчанию
     */
    public Tasks() {
    }

    /**
     * Получить id
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Получить заголовок
     * @return заголовок
     */
    public String getTitle() {
        return title;
    }

    /**
     * Получить автора
     * @return автор
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Получить текст
     * @return текст
     */
    public String getText() {
        return text;
    }

    /**
     * Задать id
     * @param id id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Задать заголовок
     * @param title заголовок
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Задать автора
     * @param author автор
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Задать текст
     * @param text текст
     */
    public void setText(String text) {
        this.text = text;
    }
}