<?php 
require_once("config.php");
$userId = $_REQUEST["id"];
if(!empty($userId)) {
	$select = "SELECT * FROM users WHERE id=".$userId;
	$rs = mysqli_query($conn, $select);
	$rowcount=mysqli_num_rows($rs);
	if($rowcount==0) {
		$resp = array("error" => "1" ,"errorMsg" => "User Not Found");
		echo json_encode( $resp );
	} else {
	
		$list = mysqli_fetch_assoc($rs);

		$data = array('id'=> $list['id'],'name'=> $list['name'], 'price'=> $list['price'], 'source'=> $list['source'] );
		$resp = array("success" => "1" , "rowCount"=> $rowcount, "userList" => $data);
		echo json_encode( $resp );
	}
} else {
	$resp = array("error" => "1" ,"errorMsg" => "Invalid Inputs");
	echo json_encode( $resp );

}

exit;
?>