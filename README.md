<p>In this assignment, we consider three types of events:</p>
<ul>
<li>one-time events</li>
<li>events which occur every <span><span class="katex"><span class="katex-mathml"><math><mrow><mi>n</mi></mrow>n</math></span><span aria-hidden="true" class="katex-html"><span class="base"><span style="height: 0.43056em; vertical-align: 0em;" class="strut"></span><span class="mord mathdefault">n</span></span></span></span></span> days (for ever)</li>
<li>events which occur within a fixed time span every <span><span class="katex"><span class="katex-mathml"><math><mrow><mi>n</mi></mrow>n</math></span><span aria-hidden="true" class="katex-html"><span class="base"><span style="height: 0.43056em; vertical-align: 0em;" class="strut"></span><span class="mord mathdefault">n</span></span></span></span></span> days</li>
</ul>
<p>These types, we want to realize by means of inheritance:</p>
<p><img alt="" src="https://syncandshare.lrz.de/dl/fiLY8657iVgo2Hdsjtgufmg8/calendar.png"></p>
<p>For simplicity, we assume that all time points (begin as well as end of time spans)
are specified in days counted from some start day onward.</p>
<p>Realize the given <code>Event</code> hierarchy. The constructors should initialize all attributes
and expect corresponding parameters in the order as listed in the diagram, starting with
the parameters for initializing the attributes of the highest super-class.</p>
<p>The method <code>diff</code> should determine in how many days relative to the given time point <code>day</code> the
event will next take place.
In case of past or single events, a negative number may be returned. Examples:</p>
<ul>
<li>For a infinitely repeating event <code>t</code> which, since day 25 is repeated every week,
the call <code>t.diff(27)</code> returns the number 5.</li>
<li>For an event which, in the time span from the 2. to the 32 day, repeats every 3 days,
i.e., on days <span><span class="katex"><span class="katex-mathml"><math><mrow><mo>(</mo><mn>2</mn><mo separator="true">,</mo><mn>5</mn><mo separator="true">,</mo><mo>…</mo><mo separator="true">,</mo><mn>26</mn><mo separator="true">,</mo><mn>29</mn><mo separator="true">,</mo><mn>32</mn><mo>)</mo></mrow>(2, 5, \ldots, 26, 29, 32)</math></span><span aria-hidden="true" class="katex-html"><span class="base"><span style="height: 1em; vertical-align: -0.25em;" class="strut"></span><span class="mopen">(</span><span class="mord">2</span><span class="mpunct">,</span><span style="margin-right: 0.166667em;" class="mspace"></span><span class="mord">5</span><span class="mpunct">,</span><span style="margin-right: 0.166667em;" class="mspace"></span><span class="minner">…</span><span style="margin-right: 0.166667em;" class="mspace"></span><span class="mpunct">,</span><span style="margin-right: 0.166667em;" class="mspace"></span><span class="mord">2</span><span class="mord">6</span><span class="mpunct">,</span><span style="margin-right: 0.166667em;" class="mspace"></span><span class="mord">2</span><span class="mord">9</span><span class="mpunct">,</span><span style="margin-right: 0.166667em;" class="mspace"></span><span class="mord">3</span><span class="mord">2</span><span class="mclose">)</span></span></span></span></span>, the call <code>t.diff(27)</code> returns the number 2.
The call <code>t.diff(33)</code>, on the other hand, should return -1 (the closest event occured the previous
day).</li>
</ul>
<p>Now realize the class <code>Calendar</code> which maintains a set of events in a list of events.
The implementation of the list is already available within the template, familiarize yourself
with that.
The calendar provides the following functionality:</p>
<ul>
<li>addition of new events (<code>addNewEvent(Event event)</code>)</li>
<li>Querying of the events of a given day (<code>Event[] eventsAt(int day)</code>)
<em>Hint: The events in the array should occur in exactly the same order as in the list.</em></li>
<li>The next event to happen relative to a given day (<code>Event nextEvent(int day)</code>)
<em>In case of multiple events occurring at the same day, the first of these in the list
should be returned.</em></li>
</ul></div>
</div><!---->
<!---->
</jhi-programming-exercise-instructions><!---->
