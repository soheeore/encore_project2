package javastudy;
public class AccessObj{
    public int p1=3;
    protected int p2=4;
    private int p3=1;
    
}

package javastudy;
public static void(String[] args){
    AccessObj obj=new AccessObj();
    System.out.println(obj.p1);     //public이라 가능
    System.out.println(obj.p2);     //같은 package안이면 괜춘
    System.out.println(obj.p3);     //private이라 안됨
    
    
}
// 상속 적용하여 확인
package javastudy;
import javastudy.AccessObj;

public class AccessObjExam extends AccessObj{
    public static void(String[] args){
    AccessObjExam obj=new AccessObjExam();
    System.out.println(obj.p1);     //public이라 가능
    System.out.println(obj.p2);     //상속받으면 패키지 달라도 가능
    System.out.println(obj.p3);     //private이라 안됨
}