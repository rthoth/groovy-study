// GroovyBeans are JavaBeans but using a much simpler sintax

class Customer {
	
	Integer id;

	String name;

	private Date dob;

}


customer = new Customer(name:'rthoth', id:51, dob: new Date());

println """A new customer:
name is ${customer.name}
Id is ${customer.id}
Dob is ${customer.dob}""";



// 

class Foo {
	String name;

	Integer id;

	protected Integer setId (Integer id) {this.id = id}
}

foo = new Foo(name: "Super ${customer.name}", id: 9);

println "\n\n\n\n\n"

println "Foo is ${foo.name} and id = ${foo.id}";




// Usando Closures with Java Interfaces...

emitter = new Emitter();

emitter.listener = {s -> println "Me mandaram dizer isso ${s}"};