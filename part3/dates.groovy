import java.time.*
import java.text.*
import java.time.format.*

def sdf = new SimpleDateFormat("MM/dd/yyyy")
def date = new Date()
println sdf.format(date)


LocalDate date2 = LocalDate.now().plusDays(5)
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
String text = date2.format(formatter);

println text
