package com.google.androidproject.model.bean;

import java.util.List;

/**
 * AndroidProject
 * <p>
 * Created by xuminmin on 2018/12/11.
 * Email: iminminxu@gmail.com
 * Copyright © 2018年 Hangzhou Gravity Cyberinfo. All rights reserved.
 * ListUnifiedBookBean
 */
public class ListUnifiedBookBean {

    /**
     * UnifiedGrade : string
     * UnifiedBooks : [{"UnifiedBookId":"00000000-0000-0000-0000-000000000000","BookId":"00000000-0000-0000-0000-000000000000","Title":"string","IconUrl":"string","Publisher":"string","Author":"string","LastActiveTime":"string","TotalMinutes":0,"Status":0,"Progress":0}]
     */
    private String UnifiedGrade;
    private List<UnifiedBooksBean> UnifiedBooks;

    public String getUnifiedGrade() {
        return UnifiedGrade;
    }

    public void setUnifiedGrade(String UnifiedGrade) {
        this.UnifiedGrade = UnifiedGrade;
    }

    public List<UnifiedBooksBean> getUnifiedBooks() {
        return UnifiedBooks;
    }

    public void setUnifiedBooks(List<UnifiedBooksBean> UnifiedBooks) {
        this.UnifiedBooks = UnifiedBooks;
    }

    public static class UnifiedBooksBean {
        /**
         * UnifiedBookId : 00000000-0000-0000-0000-000000000000
         * BookId : 00000000-0000-0000-0000-000000000000
         * Title : string
         * IconUrl : string
         * Publisher : string
         * Author : string
         * LastActiveTime : string
         * TotalMinutes : 0
         * Status : 0
         * Progress : 0
         */

        private String UnifiedBookId;
        private String BookId;
        private String Title;
        private String IconUrl;
        private String Publisher;
        private String Author;
        private String LastActiveTime;
        private int TotalMinutes;
        private int Status;
        private int Progress;

        public String getUnifiedBookId() {
            return UnifiedBookId;
        }

        public void setUnifiedBookId(String UnifiedBookId) {
            this.UnifiedBookId = UnifiedBookId;
        }

        public String getBookId() {
            return BookId;
        }

        public void setBookId(String BookId) {
            this.BookId = BookId;
        }

        public String getTitle() {
            return Title;
        }

        public void setTitle(String Title) {
            this.Title = Title;
        }

        public String getIconUrl() {
            return IconUrl;
        }

        public void setIconUrl(String IconUrl) {
            this.IconUrl = IconUrl;
        }

        public String getPublisher() {
            return Publisher;
        }

        public void setPublisher(String Publisher) {
            this.Publisher = Publisher;
        }

        public String getAuthor() {
            return Author;
        }

        public void setAuthor(String Author) {
            this.Author = Author;
        }

        public String getLastActiveTime() {
            return LastActiveTime;
        }

        public void setLastActiveTime(String LastActiveTime) {
            this.LastActiveTime = LastActiveTime;
        }

        public int getTotalMinutes() {
            return TotalMinutes;
        }

        public void setTotalMinutes(int TotalMinutes) {
            this.TotalMinutes = TotalMinutes;
        }

        public int getStatus() {
            return Status;
        }

        public void setStatus(int Status) {
            this.Status = Status;
        }

        public int getProgress() {
            return Progress;
        }

        public void setProgress(int Progress) {
            this.Progress = Progress;
        }
    }
}
