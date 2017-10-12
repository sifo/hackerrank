module S = String

let rec find_string s r =
  if (S.length s) >= (S.length r) then
    let next = S.sub s 1 ((S.length s)-1) in
    if (S.sub s 0 (S.length r)) = r then
      1 + find_string next r
    else
      find_string next r
  else
    0

let find_string string r =
  let rec aux s acc =
    if (S.length s) >= (S.length r) then
      let next = S.sub s 1 ((S.length s)-1) in
      if (S.sub s 0 (S.length r)) = r then
        aux next (acc+1)
      else
        aux next acc
    else acc
  in
  aux string 0

let () =
  let f x y = (x, y) in
  let (s, r) = Scanf.bscanf Scanf.Scanning.stdin "%s %s" f in
  Printf.printf "%i\n" (find_string s r)
