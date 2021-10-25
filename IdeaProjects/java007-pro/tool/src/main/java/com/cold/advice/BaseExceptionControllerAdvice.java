package com.cold.advice;

import com.cold.enun.TipMsgEnum;
import com.cold.util.R;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Agu
 */
@ControllerAdvice
public class BaseExceptionControllerAdvice {

    Logger logger= LoggerFactory.getLogger(BaseExceptionControllerAdvice.class);

    @ResponseBody
    @ExceptionHandler(Exception.class)
    public R customException(Exception e) {
        logger.error("异常", e);
        TipMsgEnum tipMsgEnum = TipMsgEnum.forMsg(e.getMessage());
        return R.error(tipMsgEnum);
    }

}
