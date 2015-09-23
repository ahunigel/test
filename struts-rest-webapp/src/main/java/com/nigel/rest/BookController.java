package com.nigel.rest;

import java.util.List;

import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.apache.struts2.rest.DefaultHttpHeaders;
import org.apache.struts2.rest.HttpHeaders;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

//���巵�� success ʱ�ض��� book Action 
@Results(@Result(name = "success", type = "redirectAction", params = { "actionName", "book" }))
public class BookController implements ModelDriven<Object>
{
  // ��װ id �������������
  private int id;
  private Book model = new Book();
  private List<Book> list;
  // ����ҵ���߼����
  private BookService bookService = new BookService();

  // ��ȡ id ��������ķ���
  public void setId(int id)
  {
    this.id = id;
    // ȡ�÷���ʱ˳����ʼ�� model ����
    if (id > 0)
    {
      this.model = bookService.get(id);
    }
  }

  public int getId()
  {
    return this.id;
  }

  // ������ id ������ GET ����
  // ������ҳ
  public HttpHeaders index()
  {
    list = bookService.getAll();
    return new DefaultHttpHeaders("index").disableCaching();
  }

  // ������ id ������ GET ����
  // ���������ͼ�顣
  public String editNew()
  {
    // ����һ����ͼ��
    model = new Book();
    return "editNew";
  }

  // ������ id ������ POST ����
  // ������ͼ��
  public HttpHeaders create()
  {
    // ����ͼ��
    bookService.saveOrUpdate(model);
//    addActionMessage("���ͼ��ɹ�");
    return new DefaultHttpHeaders("success").setLocationId(model.getId());
  }

  // ����� id ������ GET ����
  // ��ʾָ��ͼ��
  public HttpHeaders show()
  {
    return new DefaultHttpHeaders("show");
  }

  // ����� id ��������ָ������ edit ��Դ�� GET ����
  // ����༭ҳ�� (book-edit.jsp)
  public String edit()
  {
    return "edit";
  }

  // ����� id ������ PUT ����
  // �޸�ͼ��
  public String update()
  {
    bookService.saveOrUpdate(model);
//    addActionMessage("ͼ��༭�ɹ���");
    return "success";
  }

  // ����� id ��������ָ������ deleteConfirm ��Դ�ķ���
  // ����ɾ��ҳ�� (book-deleteConfirm.jsp)
  public String deleteConfirm()
  {
    return "deleteConfirm";
  }

  // ����� id ������ DELETE ����
  // ɾ��ͼ��
  public String destroy()
  {
    bookService.remove(id);
//    addActionMessage("�ɹ�ɾ�� ID Ϊ" + id + "��ͼ�飡");
    return "success";
  }

  // ʵ�� ModelDriven �ӿڱ���ʵ�ֵ� getModel ����
  public Object getModel()
  {
    return (list != null ? list : model);
  }
}