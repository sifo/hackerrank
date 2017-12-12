open Core.Std

module C = Char

let is_alpha_or_digit c =  (C.is_alpha c) || (C.is_digit c)

let () =
  let f x = x in
  let s = Scanf.bscanf Scanf.Scanning.stdin "%s" f in
  let l = String.to_list s in
  let functions = [is_alpha_or_digit; C.is_alpha;  C.is_digit; C.is_lowercase; C.is_uppercase] in
  functions
  |> List.map ~f:(fun f -> List.exists l f)
  |> List.map ~f:string_of_bool
  |> List.map ~f:String.capitalize
  |> List.iter ~f:(Printf.printf "%s\n")
