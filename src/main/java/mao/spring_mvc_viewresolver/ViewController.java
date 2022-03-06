package mao.spring_mvc_viewresolver;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Project name(项目名称)：Spring_MVC_ViewResolver
 * Package(包名): mao.spring_mvc_viewresolver
 * Class(类名): ViewController
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/3/6
 * Time(创建时间)： 13:22
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@Controller
@RequestMapping("")
public class ViewController
{
    @RequestMapping("/test")
    public ModelAndView freemarker()
    {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("username", "123456");
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping("/test1")
    @ResponseBody
    public String freemarker1()
    {
        return "hello";
    }

}
