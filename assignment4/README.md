GroupLayout groups its components and places them in a Container hierarchically. The grouping is done by instances of the Group class.
Group is an abstract class and two concrete classes which implement this Group class are SequentialGroup and ParallelGroup.
SequentialGroup positions its child sequentially one after another where as ParallelGroup aligns its child on top of each other.
The GroupLayout class provides methods such as createParallelGroup() and createSequentialGroup() to create groups.
