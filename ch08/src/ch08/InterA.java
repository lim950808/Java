package ch08;

public interface InterA {
	//�߻�޼ҵ�
	void method();
}

//�߻�޼ҵ带 �����ϴ� �߻�Ŭ����
abstract class A implements InterA {
	//�߻�޼ҵ�� ����(�߻�޼ҵ�� ������)
	public abstract void method();
}
//�߻�Ŭ������ ��ӹ��� ��üŬ����
class B extends A {
	@Override
	public void method() {} //�����
	
}