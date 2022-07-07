package innerinterface.window;

public class Button {
	//인터페이스 필드 선언
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	//중첩 인터페이스
	static interface OnClickListener{
		void onClick();
	}
}
