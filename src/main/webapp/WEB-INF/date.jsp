<!DOCTYPE html>
<html>
<head>
<link rel='stylesheet' href='jquery-ui.min.css' />
<link href='fullcalendar.css' rel='stylesheet' />
<link href='fullcalendar.print.css' rel='stylesheet' media='print' />
<script src='jquery.min.js'></script>
<script src='jquery-ui.custom.min.js'></script>
<script src='fullcalendar.min.js'></script>
<script>

	$(document).ready(function() {
	
		var date = new Date();
		var d = date.getDate();
		var m = date.getMonth();
		var y = date.getFullYear();
		
		$('#calendar').fullCalendar({
			theme: true,
			header: {
				left: 'prev,next today',
				center: 'title',
				right: 'month,agendaWeek,agendaDay'
			},
			editable: true,
			events: [
				{
					id: 001,
					title: 'PSD Lecture',
					start: new Date(2013, 11, 2, 08, 0),
					end: new Date(2013, 11, 2, 10, 0),
					allDay: false
				},
				{
					id: 002,
					title: 'PSD Lab',
					start: new Date(2013, 11, 2, 14, 0),
					end: new Date(2013, 11, 2, 16, 0),
					allDay: false
				},
				{
					id: 001,
					title: 'PSD Lecture',
					start: new Date(2013, 11, 9, 08, 0),
					end: new Date(2013, 11, 9, 10, 0),
					allDay: false
				},
				{
					id: 002,
					title: 'PSD Lab',
					start: new Date(2013, 11, 9, 14, 0),
					end: new Date(2013, 11, 9, 16, 0),
					allDay: false
				},
				{
					id: 001,
					title: 'PSD Lecture',
					start: new Date(2013, 11, 16, 08, 0),
					end: new Date(2013, 11, 16, 10, 0),
					allDay: false
				},
				{
					id: 002,
					title: 'PSD Lab',
					start: new Date(2013, 11, 16, 14, 0),
					end: new Date(2013, 11, 16, 16, 0),
					allDay: false
				},
				{
					id: 001,
					title: 'PSD Lecture',
					start: new Date(2013, 11, 23, 08, 0),
					end: new Date(2013, 11, 23, 10, 0),
					allDay: false
				},
				{
					id: 002,
					title: 'PSD Lab',
					start: new Date(2013, 11, 23, 14, 0),
					end: new Date(2013, 11, 23, 16, 0),
					allDay: false
				},
				{
					id: 003,
					title: 'ALG Lecture',
					start: new Date(2013, 11, 3, 08, 0),
					end: new Date(2013, 11, 3, 10, 0),
					allDay: false
				},
				{
					id: 004,
					title: 'ALG Lab',
					start: new Date(2013, 11, 3, 14, 0),
					end: new Date(2013, 11, 3, 16, 0),
					allDay: false
				},
				{
					id: 003,
					title: 'ALG Lecture',
					start: new Date(2013, 11, 10, 08, 0),
					end: new Date(2013, 11, 10, 10, 0),
					allDay: false
				},
				{
					id: 004,
					title: 'ALG Lab',
					start: new Date(2013, 11, 10, 14, 0),
					end: new Date(2013, 11, 10, 16, 0),
					allDay: false
				},
				{
					id: 003,
					title: 'ALG Lecture',
					start: new Date(2013, 11, 17, 08, 0),
					end: new Date(2013, 11, 17, 10, 0),
					allDay: false
				},
				{
					id: 004,
					title: 'ALG Lab',
					start: new Date(2013, 11, 17, 14, 0),
					end: new Date(2013, 11, 17, 16, 0),
					allDay: false
				},
				{
					id: 003,
					title: 'ALG Lecture',
					start: new Date(2013, 11, 24, 08, 0),
					end: new Date(2013, 11, 24, 10, 0),
					allDay: false
				},
				{
					id: 004,
					title: 'ALG Lab',
					start: new Date(2013, 11, 24, 14, 0),
					end: new Date(2013, 11, 24, 16, 0),
					allDay: false
				},
			]
		});
		
	});

</script>
<style>

	body {
		margin-top: 40px;
		text-align: center;
		font-size: 13px;
		font-family: "Lucida Grande",Helvetica,Arial,Verdana,sans-serif;
		}

	#calendar {
		width: 900px;
		margin: 0 auto;
		}

</style>
</head>
<body>

<h1>Welcome, ${username}</h1>

<div id='calendar'></div>
</body>
</html>
