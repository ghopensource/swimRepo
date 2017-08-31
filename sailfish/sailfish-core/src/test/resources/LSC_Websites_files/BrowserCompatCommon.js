//This file provides common javascript functionality across platforms and browsers


//---------------------------------------------------
// Commonly used global vars
//---------------------------------------------------
//determine browser version.
var _browserVersion = parseInt(navigator.appVersion);

//determine browser brand
var _appName = navigator.appName.toLowerCase();
var _isNetscape = _appName.indexOf("netscape") != -1;
var _isIE = _appName.indexOf("microsoft") != -1;

//determine operating system
var _agent = navigator.userAgent.toLowerCase();
var _isWindows = _agent.indexOf("win") != -1;
var _isMac = _agent.indexOf("mac") != -1;
var _isUnix = _agent.indexOf("x11") != -1;



function GetElementById(ElmID)
{
	if(document.getElementById)
	{
		return document.getElementById(ElmID);
	}
	else if (document.all)
	{
		return document.all[ElmID];
	}
	else if (document.layers)
	{
		return document.layers[ElmID];
	}
	else
	{
		//unknown browser type... unable to find control... return undefined.
		return undefined;
	}
}