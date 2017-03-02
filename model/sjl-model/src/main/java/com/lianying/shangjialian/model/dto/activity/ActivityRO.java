package com.lianying.shangjialian.model.dto.activity;

import java.io.Serializable;

/**
 * Created by luowen on 2017/3/1.
 */
public class ActivityRO implements Serializable{

    private static final long serialVersionUID = -1032093278907533891L;

    private Integer id;

    private String title;

    private Integer industryId;

    private String description;

    private String keyword;

    private String coverImg;

    private String bannerImg;

    private String colorPlate;

    private String backgroundMusic;

    private Integer isRecommend;

    private Integer isOffshelf;

    private Integer bizmanCopyCnt;

    private Integer netizenCopyCnt;

    public ActivityRO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getIndustryId() {
        return industryId;
    }

    public void setIndustryId(Integer industryId) {
        this.industryId = industryId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getCoverImg() {
        return coverImg;
    }

    public void setCoverImg(String coverImg) {
        this.coverImg = coverImg;
    }

    public String getBannerImg() {
        return bannerImg;
    }

    public void setBannerImg(String bannerImg) {
        this.bannerImg = bannerImg;
    }

    public String getColorPlate() {
        return colorPlate;
    }

    public void setColorPlate(String colorPlate) {
        this.colorPlate = colorPlate;
    }

    public String getBackgroundMusic() {
        return backgroundMusic;
    }

    public void setBackgroundMusic(String backgroundMusic) {
        this.backgroundMusic = backgroundMusic;
    }

    public Integer getIsRecommend() {
        return isRecommend;
    }

    public void setIsRecommend(Integer isRecommend) {
        this.isRecommend = isRecommend;
    }

    public Integer getIsOffshelf() {
        return isOffshelf;
    }

    public void setIsOffshelf(Integer isOffshelf) {
        this.isOffshelf = isOffshelf;
    }

    public Integer getBizmanCopyCnt() {
        return bizmanCopyCnt;
    }

    public void setBizmanCopyCnt(Integer bizmanCopyCnt) {
        this.bizmanCopyCnt = bizmanCopyCnt;
    }

    public Integer getNetizenCopyCnt() {
        return netizenCopyCnt;
    }

    public void setNetizenCopyCnt(Integer netizenCopyCnt) {
        this.netizenCopyCnt = netizenCopyCnt;
    }

    @Override
    public String toString() {
        return "ActivityRO{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", industryId=" + industryId +
                ", description='" + description + '\'' +
                ", keyword='" + keyword + '\'' +
                ", coverImg='" + coverImg + '\'' +
                ", bannerImg='" + bannerImg + '\'' +
                ", colorPlate='" + colorPlate + '\'' +
                ", backgroundMusic='" + backgroundMusic + '\'' +
                ", isRecommend=" + isRecommend +
                ", isOffshelf=" + isOffshelf +
                ", bizmanCopyCnt=" + bizmanCopyCnt +
                ", netizenCopyCnt=" + netizenCopyCnt +
                '}';
    }
}
