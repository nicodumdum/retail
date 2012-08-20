<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<h1>Customer Details</h1>

<h2>ID</h2>
<div>${customer.customerId}</div>

<h2>First Name</h2>
<div>${customer.firstName}</div>

<h2>Last Name</h2>
<div>${customer.lastName}</div>

<h2>Address</h2>
<div>${customer.address}</div>

<h2>Birth Date</h2>
<div>${customer.birthDate}</div>

<h2>Contact Number</h2>
<div>${customer.contactNumber}</div>

<h2>Email</h2>
<div>${customer.email}</div>

<h2>Gender</h2>
<div>${customer.gender}</div>