fn main()
{
	println!("{} days", 31);
	println!("{0}, this is {1}. {1}, this is {0}", "Alice", "Bob");
	println!("{} of {:b} people know binary, the other half doesn't", 1, 2);
	println!("{number:>0width$}", number=1, width=6);
}
