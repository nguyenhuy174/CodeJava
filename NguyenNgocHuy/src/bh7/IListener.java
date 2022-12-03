package bh7;

public interface IListener {

	void subscribe(IGenerator r);

	void response(Object from, EventArg e);
	
}
