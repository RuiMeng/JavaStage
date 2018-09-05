package com.ruimeng.Day14.forum;

public class Board {

    private int boardId;
    private String boardName;
    private int parentId;

    public Board(int boardId, String boardName, int parentId) {
        this.boardId = boardId;
        this.boardName = boardName;
        this.parentId = parentId;
    }

    public int getBoardId() {
        return boardId;
    }

    public String getBoardName() {
        return boardName;
    }

    public int getParentId() {
        return parentId;
    }

    public void setBoardId(int boardId) {
        this.boardId = boardId;
    }

    public void setBoardName(String boardName) {
        this.boardName = boardName;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public void getBoardInfo() {
        System.out.println("====板块信息====\n板块名称：" + boardName);
    }
}
