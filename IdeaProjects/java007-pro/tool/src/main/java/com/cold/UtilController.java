package com.cold;

import com.cold.param.ImgAndVieoParamenter;
import com.cold.util.R;
import com.cold.util.utli.AliyunOSSUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class UtilController {


    @PostMapping("upImg")
    public R upImg(MultipartFile file)throws Exception{
        return R.success().data(AliyunOSSUtil.uploadShopGoodsImg(file, ImgAndVieoParamenter.UTIL));
    }

}
