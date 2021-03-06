package com.nigel.invoke;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.encoding.XMLType;

public class UserRemoteTest
{

  public static void main(String[] args)
  {
    UserRemoteTest test = new UserRemoteTest();
    String result = test.invokeRemoteFuc();
    System.out.println(result);
  }

  public String invokeRemoteFuc()
  {
    // 远程调用路径
    String endpoint = "http://10.161.92.105/test-axis-ws/services/User";
    String result = "call failed!";
    Service service = new Service();
    Call call;

    try
    {
      call = (Call) service.createCall();
      call.setTargetEndpointAddress(endpoint);
      // 调用的方法名
      call.setOperationName("welcome");

      // 设置参数名
      // call.addParameter("name", // 参数名
      // XMLType.XSD_STRING, // 参数类型:String
      // ParameterMode.IN); // 参数模式：'IN' or 'OUT'

      // 设置返回值类型
      call.setReturnType(XMLType.XSD_STRING); // 返回值类型：String
      String name = "Alexia";
      result = (String) call.invoke(new Object[] { /* name */ });// 远程调用
    }
    catch (ServiceException e)
    {
      e.printStackTrace();
    }
    catch (RemoteException e)
    {
      e.printStackTrace();
    }

    return result;
  }
}
