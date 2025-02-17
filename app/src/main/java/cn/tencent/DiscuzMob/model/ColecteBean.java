package cn.tencent.DiscuzMob.model;

/**
 * Created by cg on 2017/4/20.
 */

public class ColecteBean {

    /**
     * Version : 1
     * Charset : UTF-8
     * Variables : {"cookiepre":"68nN_2132_","auth":"0da8LI/BnjvTJmwP8x63dsaH/0Tt6ZzMqW3qJB7cUcuMW7lL7cwfdh/iXliBsKmSU1lPJbo+7JlcYbPDHPvu","saltkey":"CDD8r6eh","member_uid":"7","member_username":"陈国","member_avatar":"https://ucenter.nf12.com/data/avatar/000/00/00/07_avatar_small.jpg","member_conisbind":"0","member_weixinisbind":"0","member_loginstatus":"0","groupid":"10","formhash":"77433183","ismoderator":"","readaccess":"10","notice":{"newpush":"0","newpm":"0","newprompt":"0","newmypost":"0"}}
     * Message : {"messageval":"favorite_repeat","messagestr":"抱歉，您已收藏，请勿重复收藏"}
     */

    private String Version;
    private String Charset;
    private VariablesBean Variables;
    private MessageBean Message;

    public String getVersion() {
        return Version;
    }

    public void setVersion(String Version) {
        this.Version = Version;
    }

    public String getCharset() {
        return Charset;
    }

    public void setCharset(String Charset) {
        this.Charset = Charset;
    }

    public VariablesBean getVariables() {
        return Variables;
    }

    public void setVariables(VariablesBean Variables) {
        this.Variables = Variables;
    }

    public MessageBean getMessage() {
        return Message;
    }

    public void setMessage(MessageBean Message) {
        this.Message = Message;
    }

    public static class VariablesBean {
        /**
         * cookiepre : 68nN_2132_
         * auth : 0da8LI/BnjvTJmwP8x63dsaH/0Tt6ZzMqW3qJB7cUcuMW7lL7cwfdh/iXliBsKmSU1lPJbo+7JlcYbPDHPvu
         * saltkey : CDD8r6eh
         * member_uid : 7
         * member_username : 陈国
         * member_avatar : https://ucenter.nf12.com/data/avatar/000/00/00/07_avatar_small.jpg
         * member_conisbind : 0
         * member_weixinisbind : 0
         * member_loginstatus : 0
         * groupid : 10
         * formhash : 77433183
         * ismoderator :
         * readaccess : 10
         * notice : {"newpush":"0","newpm":"0","newprompt":"0","newmypost":"0"}
         */

        private String cookiepre;
        private String auth;
        private String saltkey;
        private String member_uid;
        private String member_username;
        private String member_avatar;
        private String member_conisbind;
        private String member_weixinisbind;
        private String member_loginstatus;
        private String groupid;
        private String formhash;
        private String ismoderator;
        private String readaccess;
        private NoticeBean notice;

        public String getCookiepre() {
            return cookiepre;
        }

        public void setCookiepre(String cookiepre) {
            this.cookiepre = cookiepre;
        }

        public String getAuth() {
            return auth;
        }

        public void setAuth(String auth) {
            this.auth = auth;
        }

        public String getSaltkey() {
            return saltkey;
        }

        public void setSaltkey(String saltkey) {
            this.saltkey = saltkey;
        }

        public String getMember_uid() {
            return member_uid;
        }

        public void setMember_uid(String member_uid) {
            this.member_uid = member_uid;
        }

        public String getMember_username() {
            return member_username;
        }

        public void setMember_username(String member_username) {
            this.member_username = member_username;
        }

        public String getMember_avatar() {
            return member_avatar;
        }

        public void setMember_avatar(String member_avatar) {
            this.member_avatar = member_avatar;
        }

        public String getMember_conisbind() {
            return member_conisbind;
        }

        public void setMember_conisbind(String member_conisbind) {
            this.member_conisbind = member_conisbind;
        }

        public String getMember_weixinisbind() {
            return member_weixinisbind;
        }

        public void setMember_weixinisbind(String member_weixinisbind) {
            this.member_weixinisbind = member_weixinisbind;
        }

        public String getMember_loginstatus() {
            return member_loginstatus;
        }

        public void setMember_loginstatus(String member_loginstatus) {
            this.member_loginstatus = member_loginstatus;
        }

        public String getGroupid() {
            return groupid;
        }

        public void setGroupid(String groupid) {
            this.groupid = groupid;
        }

        public String getFormhash() {
            return formhash;
        }

        public void setFormhash(String formhash) {
            this.formhash = formhash;
        }

        public String getIsmoderator() {
            return ismoderator;
        }

        public void setIsmoderator(String ismoderator) {
            this.ismoderator = ismoderator;
        }

        public String getReadaccess() {
            return readaccess;
        }

        public void setReadaccess(String readaccess) {
            this.readaccess = readaccess;
        }

        public NoticeBean getNotice() {
            return notice;
        }

        public void setNotice(NoticeBean notice) {
            this.notice = notice;
        }

        public static class NoticeBean {
            /**
             * newpush : 0
             * newpm : 0
             * newprompt : 0
             * newmypost : 0
             */

            private String newpush;
            private String newpm;
            private String newprompt;
            private String newmypost;

            public String getNewpush() {
                return newpush;
            }

            public void setNewpush(String newpush) {
                this.newpush = newpush;
            }

            public String getNewpm() {
                return newpm;
            }

            public void setNewpm(String newpm) {
                this.newpm = newpm;
            }

            public String getNewprompt() {
                return newprompt;
            }

            public void setNewprompt(String newprompt) {
                this.newprompt = newprompt;
            }

            public String getNewmypost() {
                return newmypost;
            }

            public void setNewmypost(String newmypost) {
                this.newmypost = newmypost;
            }
        }
    }

    public static class MessageBean {
        /**
         * messageval : favorite_repeat
         * messagestr : 抱歉，您已收藏，请勿重复收藏
         */

        private String messageval;
        private String messagestr;

        public String getMessageval() {
            return messageval;
        }

        public void setMessageval(String messageval) {
            this.messageval = messageval;
        }

        public String getMessagestr() {
            return messagestr;
        }

        public void setMessagestr(String messagestr) {
            this.messagestr = messagestr;
        }
    }
}
