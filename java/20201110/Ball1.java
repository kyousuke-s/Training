/*
import java.util.*;
public class Ball1{
	public static void main(String[] args){
		int[] balls={1,2,3,4,5};
		boolean[] isPicked={false,false,false,false,false};
		int[] old=new int[5];
		for(int i=0;i<balls.length;i++){
			while(true){
				int index=new Random().nextInt(balls.length);
				if(isPicked[index]){
					continue;
				}
				System.out.println(balls[index]);
				isPicked[index]=true;
				break;
			}
		}
	}
}
*/


import java.util.*;
public class Ball1{
	public static void main(String[] args){
		//�{�[����z��ɓ����
		int[] balls={1,2,3,4,5};
		//�z��̗v�f�����܂킷
		for(int i=0;i<balls.length;i++){
			//�C���f�b�N�X�̒l�Ƀ����_���̐��l����
			int index=new Random().nextInt(balls.length-i);
			//�����_���őI�o�����ԍ��̃{�[����\��
			System.out.println(balls[index]);
			//�I�o�����{�[�������O���鏀��
			//temp�ɒ��O�ɑI�o�����{�[������
			int temp=balls[index];
			//�I�o�����{�[���ɔz��̍Ō�̗v�f����
			balls[index]=balls[balls.length-1-i];
			balls[balls.length-1-i]=temp;
		}
	}
}
