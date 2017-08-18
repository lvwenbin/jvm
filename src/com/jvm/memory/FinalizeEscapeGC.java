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
          
        //对象第一次成功拯救自救  
        SAVE_HOOK = null;  
        System.gc();  
  
        //因为finalize方法优先级很低，所以暂停0.5秒以等待它  
        Thread.sleep(500);  
        if(SAVE_HOOK!=null){  
            SAVE_HOOK.idAlive();  
        }else{  
            System.out.println("no,i am dead");  
        }  
          
        //下面这段代码与上面的完全相同，但是这次自救却失败了  
        SAVE_HOOK = null;  
        System.gc();  
          
        //因为finalize方法优先级很低，所以暂停0，5秒以等待它  
        Thread.sleep(500);  
        if(SAVE_HOOK!=null){  
            SAVE_HOOK.idAlive();  
          
        }else{  
            System.out.println("no,i am dead");  
        }  
    }  
}
