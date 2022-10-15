package com.example;

import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Button;
import org.zkoss.zul.Checkbox;
import org.zkoss.zul.Datebox;
import org.zkoss.zul.Radiogroup;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;

public class registration extends SelectorComposer<Window> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Wire
    private Button submitButton;
    @Wire
    private Checkbox acceptTermBox;
    @Wire
    private Datebox birthdayBox;
    @Wire
    private Radiogroup genderRadio;
    @Wire 
    private Textbox nameBox;
    
    @Listen("onCheck=#acceptTermBox")
    public void submitRegistration()
    {
    	if(acceptTermBox.isChecked())
    	{
    		submitButton.setDisabled(false);
    	}
    	else
    	{
    		submitButton.setDisabled(true);
    	}
    }
    
    @Listen("onClick=#resetButton")
    public void resetButton()
    {
    	submitButton.setDisabled(true);
    	acceptTermBox.setChecked(false);
    	birthdayBox.setValue(null);
    	genderRadio.setSelectedIndex(0);
    	nameBox.setValue(" ");
    }
 
}
