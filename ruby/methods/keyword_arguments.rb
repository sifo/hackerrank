# https://www.hackerrank.com/challenges/ruby-methods-keyword-arguments/problem

def convert_temp(t, input_scale:, output_scale: 'celcius')
  case input_scale
  when 'celsius'
    case output_scale
    when 'kelvin'
      return t + 273.15
    when 'fahrenheit'
      return t * (9/5.0) + 32
    end
  when 'kelvin'
    case output_scale
    when 'celsius'
      return t - 273.15
    when 'fahrenheit'
      return t * (9/5.0) - 459.67
    end
  when 'fahrenheit'
    case output_scale
    when 'celsius'
      return (t - 32) * 5/9.0
    when 'kelvin'
      return (t + 459.67) * 5/9.0
    end
  end
  return t
end
