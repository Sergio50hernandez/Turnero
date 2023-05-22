<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<!DOCTYPE html>
		<html>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
			<head>
			<title>INICIO</title>
			<link rel="stylesheet">
			<style>
			.table td{
			}
			</style>
				
            </head>
                      
    <nav class="navbar navbar-expand-lg navbar-light bg-light border border-info">
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo03" aria-controls="navbarTogglerDemo03" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <a class="navbar-brand" href="https://lutema.com/en-mx">
  	<img src="img/f2.png" class="rounded float-start" alt="">
  	
  </a>
 

  <div class="collapse navbar-collapse" id="navbarTogglerDemo03">
    <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
   
          <li class="nav-item">
        <a class="nav-link" href="general">Reporte General</a>
          </li>
          <li class="nav-item active">
		<a class="nav-link" href="actualizar">Actualizar Datos</a>
		  </li>
		  <li class="nav-item active">
		<a class="nav-link" href="eliminar">Eliminar Datos</a>
		  </li>
				    
    </ul>
  </div>
</nav>
            	<div class="container border border-info p-5 mt-3 col-xs-12 col-sm-12 col-md-12 col-lg-9 rounded"  style="background-color:white;">
	
	<img src="img/fondo.jpeg" width="100" height="100" class="rounded mx-auto d-block" alt="Empresa">
		

       <form action="general" method="post" enctype="multipart/form-data">
  
	 <div class="card ">
			<div class="card-header bg-info text-white">
				<h1 class="text-center">Registro</h1>
			</div>
		<div id="box">
  <main id="center">

<table class="table" text-center >
  <thead>
    <tr>
      <th scope="col"># Trabajador</th>
      <th scope="col">Nombre</th>
      <th scope="col">Ventiladores Buenos</th>
      <th scope="col">Ventiladores Malos</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">
      <input type="text" class="form-control" name="numero" required></th>
      <td><input type="text" class="form-control" name="nombre" required></td>
      <td><input type="text" class="form-control" name="buenos" required></td>
      <td><input type="text" class="form-control"  name="malos" required></td>
      
      
  
      
      
    </tr>
     <tr>
      <th scope="row"></th>
      <td></td>
      <td>  <div class="col-md-2">
   
    
  </div>
      </td>
      <td></td>
    </tr>

  </tbody>
</table>
</main>
</div>

<center><input type="submit" class="btn btn-success" value="REGISTRAR" ></center>

	<body style="background-color:#EEEEEE;">
		
  </div>
  </div>
  </div>
  
 	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>	
 
<script src="https://cdn.logwork.com/widget/digital.js"></script>
<center><a href="https://logwork.com/current-time-in-mexico-city-mexico-ciudad-de-mexico" class="digital-clock" data-style="flip" data-size="480" data-timezone="America/Mexico_City" data-language="en">Mexico City,  Mexico</a></center>
 </div> 
 </div>
 </div> 
 </div>
 
<div>

	</form>
</body>
</html>