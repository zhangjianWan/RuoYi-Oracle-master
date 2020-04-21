package com.ruoyi.framework.shiro;

import com.ruoyi.framework.web.domain.server.Sys;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;

/**
 * @ClassName Quickstart
 * @Description TODO
 * @Author zhangjian
 * @Date 2020/4/17 11:00
 **/
public class Quickstart {
    public static void main(String[] args) {

        //获得当前正在执行的主题
        Subject currentUser = SecurityUtils.getSubject();
        Session session = currentUser.getSession();
        session.setAttribute("someKey", "aValue");
        if (!currentUser.isAuthenticated()) {

            UsernamePasswordToken token = new UsernamePasswordToken("lonestarr", "vespa");
            token.setRememberMe(true);
            currentUser.login(token);
            try {
                currentUser.login(token);
                //if no exception, that's it, we're done!
            } catch (UnknownAccountException uae) {
                //username wasn't in the system, show them an error message?
            } catch (IncorrectCredentialsException ice) {
                //password didn't match, try again?
            } catch (LockedAccountException lae) {
                //account for that username is locked - can't login.  Show them a message?
            } catch (AuthenticationException ae) {
                //unexpected condition - error?
            }

            //print their identifying principal (in this case, a username):
            System.out.println( "User [" + currentUser.getPrincipal() + "] logged in successfully." );
        }
    }
}
