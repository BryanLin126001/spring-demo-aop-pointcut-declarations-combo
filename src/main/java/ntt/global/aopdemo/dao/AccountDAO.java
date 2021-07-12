package ntt.global.aopdemo.dao;

import ntt.global.aopdemo.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountDAO
{
    private String name;
    private String serviceCode;

    public void addAccount(Account account, boolean vipFlag)
    {
        System.out.println(getClass() + " : Doing my db work: add account \n");
    }

    public String getName()
    {
        System.out.println("In AccountDAO.getName()");
        return name;
    }

    public void setName(String name)
    {
        System.out.println("In AccountDAO.setName()");
        this.name = name;
    }

    public String getServiceCode()
    {
        System.out.println("In AccountDAO.getService()");
        return serviceCode;
    }

    public void setServiceCode(String serviceCode)
    {
        System.out.println("In AccountDAO.setServiceCode()");
        this.serviceCode = serviceCode;
    }
}
