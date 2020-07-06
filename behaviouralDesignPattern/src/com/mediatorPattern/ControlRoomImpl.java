package com.mediatorPattern;

public class ControlRoomImpl implements ControlRoom {

	@Override
	public String sendConfirmation(Flight1 f1 , Flight2 f2) {
		
		int altitude1 = f1.SendAltitute();
		int altitude2 = f2.SendAltitute();
		
		return (altitude1 > altitude2)? "Flight-2 is allowed to land.." : "Flight-1 is allowed to land" ;
	}

}
