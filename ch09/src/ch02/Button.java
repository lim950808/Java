package ch02;

public class Button {
	//�ʵ� - ���
	OnclickListener listener;
	
	public void setOnListener(OnclickListener listener) {
		this.listener = listener;
	}

	//
	void touch() {
		listener.onClick();
	}
	

//���� �������̽�
	interface OnclickListener {
		void onClick();
	}
}
