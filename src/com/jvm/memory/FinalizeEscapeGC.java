package com.jvm.memory;

public class FinalizeEscapeGC {
	public static FinalizeEscapeGC SAVE_HOOK = null;  
    
    public void idAlive(){  
        System.out.println("yew,i am still alive");  
    }  
      
    @Override  
    protected void finalize() throws Throwable{  
        super.finalize();  
        System.out.println("finalize method executed");  
        FinalizeEscapeGC.SAVE_HOOK = this;  
    }  
      
    public static void main(String[] args) throws Throwable{  
        SAVE_HOOK = new FinalizeEscapeGC();  
          
        //�����һ�γɹ������Ծ�  
        SAVE_HOOK = null;  
        System.gc();  
  
        //��Ϊfinalize�������ȼ��ܵͣ�������ͣ0.5���Եȴ���  
        Thread.sleep(500);  
        if(SAVE_HOOK!=null){  
            SAVE_HOOK.idAlive();  
        }else{  
            System.out.println("no,i am dead");  
        }  
          
        //������δ������������ȫ��ͬ����������Ծ�ȴʧ����  
        SAVE_HOOK = null;  
        System.gc();  
          
        //��Ϊfinalize�������ȼ��ܵͣ�������ͣ0��5���Եȴ���  
        Thread.sleep(500);  
        if(SAVE_HOOK!=null){  
            SAVE_HOOK.idAlive();  
          
        }else{  
            System.out.println("no,i am dead");  
        }  
    }  
}
