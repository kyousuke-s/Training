public class Mouse implements UsbConnectable{
	@Override
	//オーバーライドする際、アクセス修飾子は同等か弱める方向にしか変更できない
	//もしpublicを省略するとコンパイルエラー
	public void usbConnect(){
		System.out.println("USB接続にてマウス操作ができます。");
	}
}
