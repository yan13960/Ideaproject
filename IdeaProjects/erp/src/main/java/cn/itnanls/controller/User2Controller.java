package cn.itnanls.controller;

import cn.itnanls.entity.User2;
import cn.itnanls.service.User2Service;

import com.github.pagehelper.PageInfo;
import com.mysql.cj.log.LogFactory;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.Date;

/**
 * (User2)表控制层
 *
 * @author makejava
 * @since 2021-10-04 21:44:07
 */
@Controller
@RequestMapping("user2")
@Slf4j
public class User2Controller {

    @RequestMapping
    public String toUser(Model model){
        model.addAttribute("user", Arrays.asList(1,2,3,4));
        model.addAttribute("user2", new Date());
        return "user";
    }

    /*Logger logger=LoggerFactory.getLogger(User2Controller.class);*/
    /**
     * 服务对象
     */
    @Resource
    private User2Service user2Service;

    /**
     * 分页查询
     *
     */
    @GetMapping("selectAll")
    @ResponseBody
    public PageInfo<User2> selectAll(){
        return user2Service.getPage(1,4);
    }


    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    @ResponseBody
    public ResponseEntity<User2> queryById(@PathVariable("id") Integer id) {
        /*logger.info("这是info");
        logger.trace("这是trace");
        logger.debug("这是debug");
        logger.warn("这是warn");
        logger.error("这是error");*/

        log.info("这是info");
        log.trace("这是trace");
        log.debug("这是debug");
        log.warn("这是warn");
        log.error("这是error");
        return ResponseEntity.ok(this.user2Service.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param user2 实体
     * @return 新增结果
     */
    @PostMapping
    @ResponseBody
    public ResponseEntity<User2> add(User2 user2) {
        return ResponseEntity.ok(this.user2Service.insert(user2));
    }

    /**
     * 编辑数据
     *
     * @param user2 实体
     * @return 编辑结果
     */
    @PutMapping
    @ResponseBody
    public ResponseEntity<User2> edit(User2 user2) {
        return ResponseEntity.ok(this.user2Service.update(user2));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    @ResponseBody
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.user2Service.deleteById(id));
    }

}

