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
    // Զ�̵���·��
    String endpoint = "http://10.161.92.105/test-axis-ws/services/User";
    String result = "call failed!";
    Service service = new Service();
    Call call;

    try
    {
      call = (Call) service.createCall();
      call.setTargetEndpointAddress(endpoint);
      // ���õķ�����
      call.setOperationName("welcome");

      // ���ò�����
      // call.addParameter("name", // ������
      // XMLType.XSD_STRING, // ��������:String
      // ParameterMode.IN); // ����ģʽ��'IN' or 'OUT'

      // ���÷���ֵ����
      call.setReturnType(XMLType.XSD_STRING); // ����ֵ���ͣ�String
      String name = "Alexia";
      result = (String) call.invoke(new Object[] { /* name */ });// Զ�̵���
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
