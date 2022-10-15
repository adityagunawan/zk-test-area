package com.example;

import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Label;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;

public class property extends SelectorComposer<Window>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Wire
	Textbox input; //wired to a component called input
	@Wire
	Label result; //wired to a component called result

	@Listen("onClick=#retrieve")
	public void retrieve() {
		result.setValue(input.getValue());
	}
}
