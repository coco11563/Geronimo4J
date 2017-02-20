package pub.sha0w.geronimo.model;

/**
 * Created by coco1 on 2017/2/13.
 */
public class HbaseCell {
    /**
     *
     * @param content 微博内容
     * @param gender 性别
     * @param picURL 图片URL
     * @param otherInform 整体讯息
     * @param username 用户名
     * @param rowkey rowKey
     */
    public HbaseCell(String content, String gender, String picURL, String otherInform, String username, String rowkey) {
        setContent(content);
        setUsername(username);
        setGender(gender);
        setPicURL(picURL);
        setOtherInform(otherInform);
        setRowkey(rowkey);
    }

    //Other Information
    private String content;
    private String gender;
    private String picURL;
    private String otherInform;
    private String username;
    //Row key
    private String rowkey;

    public String getRowkey() {
        return rowkey;
    }

    public void setRowkey(String rowkey) {
        this.rowkey = rowkey;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getOtherInform() {
        return otherInform;
    }

    public void setOtherInform(String otherInform) {
        this.otherInform = otherInform;
    }

    public String getPicURL() {
        return picURL;
    }

    public void setPicURL(String picURL) {
        this.picURL = picURL;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
