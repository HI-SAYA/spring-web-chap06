package com.ohgiraffers.fileupload;

/* 업로드 된 파일과 관련한 정보를 모아서 관리하는 DTO */
public class FileDTO {

    private String originFilName;
    private String savedName;
    private String filePath;
    private String fileDescription;

    public FileDTO() {
    }

    public FileDTO(String originFilName, String savedName, String filePath, String fileDescription) {
        this.originFilName = originFilName;
        this.savedName = savedName;
        this.filePath = filePath;
        this.fileDescription = fileDescription;
    }

    public String getOriginFilName() {
        return originFilName;
    }

    public void setOriginFilName(String originFilName) {
        this.originFilName = originFilName;
    }

    public String getSavedName() {
        return savedName;
    }

    public void setSavedName(String savedName) {
        this.savedName = savedName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFileDescription() {
        return fileDescription;
    }

    public void setFileDescription(String fileDescription) {
        this.fileDescription = fileDescription;
    }

    @Override
    public String toString() {
        return "FileDTO{" +
                "originFilName='" + originFilName + '\'' +
                ", savedName='" + savedName + '\'' +
                ", filePath='" + filePath + '\'' +
                ", fileDescription='" + fileDescription + '\'' +
                '}';
    }
}
