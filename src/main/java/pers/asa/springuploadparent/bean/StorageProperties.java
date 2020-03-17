package pers.asa.springuploadparent.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import pers.asa.springuploadparent.util.SupUtils;

/**
 * @version 1.0.0
 * @author: rongbin.xie
 * @date: 2020/3/16
 * @CopyRight: COPYRIGHT © 2001 - 2019 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 **/
@ConfigurationProperties("storage")
public class StorageProperties {
    /**
     * Folder location for storing files
     */
    private String location = SupUtils.isWindows() ? "H:/upload-dir" : "/data/_save";

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
