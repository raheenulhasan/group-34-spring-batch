
package com.techprimers.springbatchexample1.batch;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.techprimers.springbatchexample1.model.User;

@Component
public class Processor implements ItemProcessor<User, User>
{

    private static final Map<String, String> DEPT_NAMES = new HashMap<String, String>();

    public Processor()
    {
        System.out.println("Entering Processor() of Processor.");

        DEPT_NAMES.put("001", "Technology");
        DEPT_NAMES.put("002", "Operations");
        DEPT_NAMES.put("003", "Accounts");
        System.out.println("Exiting Processor() of Processor.");

    }

    public User process(User user) throws Exception
    {

        System.out.println("Entering process() of Processor.");

        String deptCode = user.getDept();
        String dept = DEPT_NAMES.get(deptCode);
        user.setDept(dept);
        user.setTime(new Date());
        System.out.println(String.format("Converted from [%s] to [%s]", deptCode, dept));
        System.out.println("Exiting process() of Processor.");

        return user;
    }
}
