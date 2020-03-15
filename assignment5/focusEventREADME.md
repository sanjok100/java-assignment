In short, all we have to do in order to work with a FocusEvent is:

Create a new FocusEvent class.
Override the methods that correspond to the events that you want to monitor about the component e.g focusGained, focusLost and customize as you wish the handling of the respective events. Now every time the monitored component gains or looses focus the corresponding method will be executed.
Use the addFocusListener method of the component you want to monitor, in order to add the FocusEvent you’ve created.
