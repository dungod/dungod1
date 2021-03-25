class Quadrilateral{
protected:
	int h;
	int w;
public:
	virtual void setH(int value)=0;
	virtual void setW(int vaule)=0;
	virtual int getH()=0;
	virtual int getW()=0;
};
// 长方形
class Rectangle: public Quadrilateral{
public:
	virtual void setH(int value){
		h = value; 
	}
	virtual void setW(int vaule){
		w = vaule;
	}
	virtual int getH(){
		return h;
	}
	virtual int getW(){
		return w;
	}
};
// 正方形
class Square:public Quadrilateral{
private:
	void setSide(int value){
		h = w = value; 	
	}
public:
	virtual void setH(int value){
		setSide(value); 
	}
	virtual void setW(int vaule){
		setSide(vaule);
	}
	virtual int getH(){
		return h;
	}
	virtual int getW(){
		return w;
	}
};
class Clinet{
public:
	void setRectangle(Rectangle* r){
		if(r->getW()<r->getH()){
			r->setW(r->getH()+1);
		}
	} 	
};

//客户端调用
int main()
{
	cout<<"建造者模式演示\n";
	

	//看代码不用考虑以下内容
	int cin_a;
	cin>>cin_a;
	return 0;
}
