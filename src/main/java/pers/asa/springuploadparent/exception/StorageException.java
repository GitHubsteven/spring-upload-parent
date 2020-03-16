package pers.asa.springuploadparent.exception;

/**
 * @version 1.0.0
 * @author: rongbin.xie
 * @date: 2020/3/16
 * @CopyRight: COPYRIGHT © 2001 - 2019 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 **/
public class StorageException extends RuntimeException {
    public StorageException(String message) {
        super(message);
    }

    public StorageException(String message, Throwable cause) {
        super(message, cause);
    }
}
