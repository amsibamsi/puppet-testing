define foreach(
  $x,
) {
  notify {
    $name:
      ;
    $x[0][key]:
      ;
    $x[1][key]:
      ;
  }
}

foreach {
  "a":
    x => [{key => 'msg1'}, {key =>'msg2'}];
}
